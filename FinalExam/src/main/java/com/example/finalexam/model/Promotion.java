package com.example.finalexam.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name = "promotion")
public class Promotion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "Không được trống!!")
    private String title;

    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    @Future(message = "Không được nhập bé hơn ngày hiện tại")
    @NotNull(message = "Không được trống!!")
    private Date begin;

    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    @Future(message = "Không được nhập bé hơn ngày hiện tại" )
    @NotNull(message = "Không được trống!!")
    private Date end;

    @NotBlank(message = "Không được trống!!")
    private String content;

    @ManyToOne
    @JoinColumn(name = "subpromotion_id", referencedColumnName = "id")
    @NotNull(message = "Không được trống!!")
    private SubPromotion subPromotion;


    @AssertTrue()
    public boolean isValidEndDate() {
        if (begin != null && end != null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(begin);
            calendar.add(Calendar.DATE, 1);
            Date nextDay = calendar.getTime();
            return end.after(nextDay);
        }
        return true;
    }

    public Promotion() {
    }

    public Promotion(Integer id, String title, Date begin, Date end, String content, SubPromotion subPromotion) {
        this.id = id;
        this.title = title;
        this.begin = begin;
        this.end = end;
        this.content = content;
        this.subPromotion = subPromotion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public SubPromotion getSubPromotion() {
        return subPromotion;
    }

    public void setSubPromotion(SubPromotion subPromotion) {
        this.subPromotion = subPromotion;
    }


}
