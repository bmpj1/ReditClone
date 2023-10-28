package com.springboot.server.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "token")
public class VerificationToken {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;
  private String token;
  @OneToOne(fetch = LAZY)
  private User user;
  private Instant expireDate;
}
