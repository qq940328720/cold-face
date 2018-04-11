package dal.dao;

import dal.model.NoodlesType;

public interface NoodlesTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NoodlesType record);

    int insertSelective(NoodlesType record);

    NoodlesType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NoodlesType record);

    int updateByPrimaryKeyWithBLOBs(NoodlesType record);

    int updateByPrimaryKey(NoodlesType record);
}