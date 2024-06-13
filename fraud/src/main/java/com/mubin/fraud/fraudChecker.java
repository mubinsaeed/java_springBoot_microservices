package com.mubin.fraud;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Getter
@Setter
@Builder
@Entity

public class fraudChecker {


        @Id
        @SequenceGenerator(
                name = "fraud_id_sequence",
                sequenceName = "fraud_id_sequence"
        )
        @GeneratedValue(
                strategy = GenerationType.SEQUENCE,
                generator = "fraud_id_sequence"
        )
        @Column(name = "id")
        private Integer id;
        @Column(name = "customer_id")
        private  Integer customerId;
        @Column(name = "is_fraudster")
        private boolean isfraudster;
        @Column(name = "created_at")
        private LocalDateTime createdAt;

    }





