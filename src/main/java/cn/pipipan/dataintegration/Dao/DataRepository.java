package cn.pipipan.dataintegration.Dao;

import cn.pipipan.dataintegration.Domain.Data;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends MongoRepository<Data, String> {
}
