package com.dmdev.entity.client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "transaction_processing", schema = "bank")
public class TransactionProcessing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "client_account_id")
    private Long clientAccountId;

    @Column(name = "payment_id")
    private Long paymentId;

    @Column(name = "transfer_sum")
    private Long transferSum;

    private LocalDate createAt;
}
