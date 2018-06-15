package impl;

import dal.dao.NoodlesTypeMapper;
import dal.model.NoodlesType;
import dto.NoodlesResponseDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.NoodlesService;

import java.util.List;

/**
 * Created by ylj on 18-3-28.
 */
@Service
public class NoodlesServiceImpl implements NoodlesService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private NoodlesTypeMapper noodlesTypeMapper;

    public NoodlesResponseDTO getNoodlesType(String userName, String appCode) {
        logger.info("请求参数：userName:" + userName + "appCode:" + appCode);
        NoodlesResponseDTO response = new NoodlesResponseDTO();
        List<NoodlesType> types = noodlesTypeMapper.selectAllProvider();
        response.setResultData(types);
        logger.info("返回:" + response);
        return response;
    }

}
