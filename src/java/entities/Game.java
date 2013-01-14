/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Inspektor
 */
@Entity
@Table(name = "game")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Game.findAll", query = "SELECT g FROM Game g"),
    @NamedQuery(name = "Game.findByGameId", query = "SELECT g FROM Game g WHERE g.gameId = :gameId"),
    @NamedQuery(name = "Game.findByAnswersCorrect", query = "SELECT g FROM Game g WHERE g.answersCorrect = :answersCorrect"),
    @NamedQuery(name = "Game.findByAnswersWrong", query = "SELECT g FROM Game g WHERE g.answersWrong = :answersWrong"),
    @NamedQuery(name = "Game.findByTimeStarted", query = "SELECT g FROM Game g WHERE g.timeStarted = :timeStarted"),
    @NamedQuery(name = "Game.findByTimeEnded", query = "SELECT g FROM Game g WHERE g.timeEnded = :timeEnded"),
    @NamedQuery(name = "Game.findByGameType", query = "SELECT g FROM Game g WHERE g.gameType = :gameType"),
    @NamedQuery(name = "Game.findByLastChangedBy", query = "SELECT g FROM Game g WHERE g.lastChangedBy = :lastChangedBy"),
    @NamedQuery(name = "Game.findByLastChangedDate", query = "SELECT g FROM Game g WHERE g.lastChangedDate = :lastChangedDate")})
public class Game implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @NotNull
    @Column(name = "game_id")
    private Integer gameId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "answers_correct")
    private int answersCorrect;
    @Basic(optional = false)
    @NotNull
    @Column(name = "answers_wrong")
    private int answersWrong;
    @Basic(optional = false)
    @NotNull
    @Column(name = "time_started")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeStarted;
    @Basic(optional = false)
    @NotNull
    @Column(name = "time_ended")
    @Temporal(TemporalType.TIMESTAMP)
    private Date timeEnded;
    @Size(max = 45)
    @Column(name = "game_type")
    private String gameType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_changed_by")
    private int lastChangedBy;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_changed_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastChangedDate;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @ManyToOne(optional = false)
    private Users userId;

    public Game() {
    }

    public Game(Integer gameId) {
        this.gameId = gameId;
    }

    public Game(Integer gameId, int answersCorrect, int answersWrong, Date timeStarted, Date timeEnded, int lastChangedBy, Date lastChangedDate) {
        this.gameId = gameId;
        this.answersCorrect = answersCorrect;
        this.answersWrong = answersWrong;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.lastChangedBy = lastChangedBy;
        this.lastChangedDate = lastChangedDate;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public int getAnswersCorrect() {
        return answersCorrect;
    }

    public void setAnswersCorrect(int answersCorrect) {
        this.answersCorrect = answersCorrect;
    }

    public int getAnswersWrong() {
        return answersWrong;
    }

    public void setAnswersWrong(int answersWrong) {
        this.answersWrong = answersWrong;
    }

    public Date getTimeStarted() {
        return timeStarted;
    }

    public void setTimeStarted(Date timeStarted) {
        this.timeStarted = timeStarted;
    }

    public Date getTimeEnded() {
        return timeEnded;
    }

    public void setTimeEnded(Date timeEnded) {
        this.timeEnded = timeEnded;
    }

    public String getGameType() {
        return gameType;
    }

    public void setGameType(String gameType) {
        this.gameType = gameType;
    }

    public int getLastChangedBy() {
        return lastChangedBy;
    }

    public void setLastChangedBy(int lastChangedBy) {
        this.lastChangedBy = lastChangedBy;
    }

    public Date getLastChangedDate() {
        return lastChangedDate;
    }

    public void setLastChangedDate(Date lastChangedDate) {
        this.lastChangedDate = lastChangedDate;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gameId != null ? gameId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Game)) {
            return false;
        }
        Game other = (Game) object;
        if ((this.gameId == null && other.gameId != null) || (this.gameId != null && !this.gameId.equals(other.gameId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Game[ gameId=" + gameId + " ]";
    }
    
}
