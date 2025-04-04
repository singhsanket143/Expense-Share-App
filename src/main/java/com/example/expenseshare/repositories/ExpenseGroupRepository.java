package com.example.expenseshare.repositories;

import com.example.expenseshare.models.ExpenseGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseGroupRepository extends JpaRepository<ExpenseGroup, Long> {
}
