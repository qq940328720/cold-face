package impl;

import dto.NoodlesResponseDTO;
import org.springframework.stereotype.Service;
import service.NoodlesService;

/**
 * Created by ylj on 18-3-28.
 */
@Service
public class NoodlesServiceImpl implements NoodlesService {

    public NoodlesResponseDTO getNoodlesType(String userName, String appCode) {
        NoodlesResponseDTO response = new NoodlesResponseDTO();
        response.setResultData("民以食为天，我以面为食！");
        return response;
    }

}
