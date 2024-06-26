package com.ssafy.BonVoyage.group.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ssafy.BonVoyage.file.domain.ProfileImage;
import com.ssafy.BonVoyage.group.dto.TravelGroupDto;
import com.ssafy.BonVoyage.group.enumeration.Preference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.List;


@Data
@Table
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TravelGroup {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "group_id")
    private Long id;

    @Column
    private String groupName;

    @Column
    private String description;


    @Enumerated(EnumType.STRING)
    private Preference preference;

    @Column
    private String groupProfileImage;


    @Column
    private Long owner;

    public static TravelGroup toEntity(TravelGroupDto dto) {
        return TravelGroup.builder()
                .groupName(dto.getGroupName())
                .preference(dto.getPreference())
                .groupProfileImage(dto.getGroupProfileImage())
                .build();
    }

    public void update(final String groupName, final String description) {
        this.groupName = groupName;
        this.description = description;
    }


    public boolean hasImage() {
        return !groupProfileImage.equals("");
    }

    public void updateImageUrl(final String imageUrl) {
        this.groupProfileImage = imageUrl;
    }
}
