package com.anthonyvalle.polcall.Service;

import com.anthonyvalle.polcall.Repo.VoterRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VoterService {

    @Autowired
    VoterRepo voterRepo;


}
