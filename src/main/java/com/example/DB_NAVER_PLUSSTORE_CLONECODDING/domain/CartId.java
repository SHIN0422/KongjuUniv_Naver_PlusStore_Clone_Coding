package com.example.DB_NAVER_PLUSSTORE_CLONECODDING.domain;

import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Getter
@NoArgsConstructor
@EqualsAndHashCode
public class CartId implements Serializable {

    private Long customerId;
    private Long optionId;

    public CartId(Long customerId, Long optionId) {
        this.customerId = customerId;
        this.optionId = optionId;
    }
}
