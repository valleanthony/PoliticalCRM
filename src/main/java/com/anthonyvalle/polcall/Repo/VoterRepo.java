package com.anthonyvalle.polcall.Repo;


import com.anthonyvalle.polcall.Entity.VoterEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoterRepo extends CrudRepository<VoterEntity,Long> {
    VoterEntity findByPublicID(String id);

}
