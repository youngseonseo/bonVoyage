package com.ssafy.BonVoyage.group.service;

import com.ssafy.BonVoyage.auth.domain.Member;
import com.ssafy.BonVoyage.group.domain.TravelGroup;
import com.ssafy.BonVoyage.group.repository.TravelGroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class GroupService {

    private final TravelGroupRepository travelGroupRepository;

    public TravelGroup addGroup(TravelGroup sendNotificationDto, Member member) {
        return null;
    }
}
