package dal.dao;

import dal.model.Noodles;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoodlesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Noodles record);

    int insertSelective(Noodles record);

    Noodles selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Noodles record);

    int updateByPrimaryKeyWithBLOBs(Noodles record);

    int updateByPrimaryKey(Noodles record);
}