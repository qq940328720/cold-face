package dal.dao;

import dal.model.NoodlesType;
import dal.sqlprovider.NoodlesTypeProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import java.util.List;

@Mapper
public interface NoodlesTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(NoodlesType record);

    int insertSelective(NoodlesType record);

    NoodlesType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NoodlesType record);

    int updateByPrimaryKeyWithBLOBs(NoodlesType record);

    int updateByPrimaryKey(NoodlesType record);

    @SelectProvider(type = NoodlesTypeProvider.class, method = "selectPersonLike")
    List<NoodlesType> selectAllProvider();

    List<NoodlesType> selectAll();
}