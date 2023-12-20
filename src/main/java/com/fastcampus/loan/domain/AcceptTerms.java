package com.fastcampus.loan.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.SQLRestriction;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@DynamicUpdate
@SQLRestriction(value = "is_deleted=false")
public class AcceptTerms extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(nullable = false, updatable = false)
  @EqualsAndHashCode.Include
  private Long acceptTermsId;

  @Column(columnDefinition = "bigint NOT NULL COMMENT '신청 ID'")
  private Long applicationId;

  @Column(columnDefinition = "bigint NOT NULL COMMENT '약관 ID'")
  private Long termsId;
}
