package com.example.expenseshare.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ExpenseGroup extends BaseEntity{

    private String name;

    @ManyToOne
    @JoinColumn(name="owner")
    private User owner;

    @ManyToMany
    @JoinTable(
            name = "expense_group_members",
            joinColumns = @JoinColumn(name="expense_group_id"),
            inverseJoinColumns = @JoinColumn(name="member_id")
    )
    private List<User> members;
}
