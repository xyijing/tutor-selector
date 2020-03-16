package com.example.tutorselector.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class Direction {
    @Id
    private int dirId;
    private int dirWeight;
}
