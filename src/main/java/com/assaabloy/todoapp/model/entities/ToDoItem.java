package com.assaabloy.todoapp.model.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "todo_item")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ToDoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Column(name = "todo_name")
    private String todoName;

    @NotEmpty
    @Column(name = "todo_category")
    private String category;

    @Column(name = "todo_status")
    @Enumerated(EnumType.STRING)
    private ToDoStatus toDoStatus;
}