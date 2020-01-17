package com.anthonyvalle.polcall.Repo;

import com.anthonyvalle.polcall.Entity.CallLogEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CallLogRepo extends CrudRepository<CallLogEntity,Long> {
}
