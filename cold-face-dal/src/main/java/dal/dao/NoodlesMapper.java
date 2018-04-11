package dal.dao;

import dal.model.Noodles;

public interface NoodlesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Noodles record);

    int insertSelective(Noodles record);

    Noodles selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Noodles record);

    int updateByPrimaryKeyWithBLOBs(Noodles record);

    int updateByPrimaryKey(Noodles record);
}