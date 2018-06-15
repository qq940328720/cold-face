package dal.sqlprovider;

import org.apache.ibatis.jdbc.SQL;

public class NoodlesTypeProvider {

    public String selectPersonLike() {
        return new SQL() {{
            SELECT("*");
            FROM("noodles_type");
        }}.toString();
    }
}
