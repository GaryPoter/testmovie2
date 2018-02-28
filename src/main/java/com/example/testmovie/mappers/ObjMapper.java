package com.example.testmovie.mappers;

import com.example.testmovie.DAO.Actor;
import com.example.testmovie.utils.ConditionalObj;
import com.example.testmovie.utils.Table;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

public interface ObjMapper<T> {
    @SelectProvider(type = DynaSqlProvider.class, method = "selectWithParam")
    ArrayList<T> getObjWithParams(Table table);

    @InsertProvider(type = DynaSqlProvider.class, method =  "insertWithParam")
    int addObjWithParams(Table table);

    @DeleteProvider(type = DynaSqlProvider.class, method = "deleteWithParam")
    int deleteObjWithParams(Table table);

    @UpdateProvider(type = DynaSqlProvider.class, method = "updateWithParam")
    int updateObjWirhParams(Table table);
}
