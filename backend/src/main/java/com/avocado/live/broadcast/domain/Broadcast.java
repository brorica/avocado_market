package com.avocado.live.broadcast.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Entity
@Setter
@Builder
@AllArgsConstructor
@ToString
public class Broadcast {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sessionId;

    @NotNull
    private String title;

    @NotNull
    private String introduce;

    private String link;

    private Boolean status;

    private Date startAt;




    public Broadcast(String sessionId) {
        this.sessionId = sessionId;
    }

    protected Broadcast() {}
}