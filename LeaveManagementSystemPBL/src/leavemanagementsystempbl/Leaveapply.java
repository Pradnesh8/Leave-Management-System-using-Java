/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leavemanagementsystempbl;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Pradnesh
 */
@Entity
@Table(name = "leaveapply", catalog = "pbl", schema = "public")
@NamedQueries({
    @NamedQuery(name = "Leaveapply.findAll", query = "SELECT l FROM Leaveapply l")
    , @NamedQuery(name = "Leaveapply.findBySrNo", query = "SELECT l FROM Leaveapply l WHERE l.srNo = :srNo")
    , @NamedQuery(name = "Leaveapply.findByUserid", query = "SELECT l FROM Leaveapply l WHERE l.userid = :userid")
    , @NamedQuery(name = "Leaveapply.findByUsername", query = "SELECT l FROM Leaveapply l WHERE l.username = :username")
    , @NamedQuery(name = "Leaveapply.findByLeaveApplyDate", query = "SELECT l FROM Leaveapply l WHERE l.leaveApplyDate = :leaveApplyDate")
    , @NamedQuery(name = "Leaveapply.findByLeaveEndDate", query = "SELECT l FROM Leaveapply l WHERE l.leaveEndDate = :leaveEndDate")
    , @NamedQuery(name = "Leaveapply.findByNoOfDays", query = "SELECT l FROM Leaveapply l WHERE l.noOfDays = :noOfDays")
    , @NamedQuery(name = "Leaveapply.findByLeavetype", query = "SELECT l FROM Leaveapply l WHERE l.leavetype = :leavetype")
    , @NamedQuery(name = "Leaveapply.findByLeavereason", query = "SELECT l FROM Leaveapply l WHERE l.leavereason = :leavereason")
    , @NamedQuery(name = "Leaveapply.findByLeavestatus", query = "SELECT l FROM Leaveapply l WHERE l.leavestatus = :leavestatus")})
public class Leaveapply implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "sr_no")
    private Integer srNo;
    @Column(name = "userid")
    private String userid;
    @Column(name = "username")
    private String username;
    @Column(name = "leave_apply_date")
    private String leaveApplyDate;
    @Column(name = "leave_end_date")
    private String leaveEndDate;
    @Column(name = "no_of_days")
    private String noOfDays;
    @Column(name = "leavetype")
    private String leavetype;
    @Column(name = "leavereason")
    private String leavereason;
    @Column(name = "leavestatus")
    private String leavestatus;

    public Leaveapply() {
    }

    public Leaveapply(Integer srNo) {
        this.srNo = srNo;
    }

    public Integer getSrNo() {
        return srNo;
    }

    public void setSrNo(Integer srNo) {
        Integer oldSrNo = this.srNo;
        this.srNo = srNo;
        changeSupport.firePropertyChange("srNo", oldSrNo, srNo);
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        String oldUserid = this.userid;
        this.userid = userid;
        changeSupport.firePropertyChange("userid", oldUserid, userid);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getLeaveApplyDate() {
        return leaveApplyDate;
    }

    public void setLeaveApplyDate(String leaveApplyDate) {
        String oldLeaveApplyDate = this.leaveApplyDate;
        this.leaveApplyDate = leaveApplyDate;
        changeSupport.firePropertyChange("leaveApplyDate", oldLeaveApplyDate, leaveApplyDate);
    }

    public String getLeaveEndDate() {
        return leaveEndDate;
    }

    public void setLeaveEndDate(String leaveEndDate) {
        String oldLeaveEndDate = this.leaveEndDate;
        this.leaveEndDate = leaveEndDate;
        changeSupport.firePropertyChange("leaveEndDate", oldLeaveEndDate, leaveEndDate);
    }

    public String getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(String noOfDays) {
        String oldNoOfDays = this.noOfDays;
        this.noOfDays = noOfDays;
        changeSupport.firePropertyChange("noOfDays", oldNoOfDays, noOfDays);
    }

    public String getLeavetype() {
        return leavetype;
    }

    public void setLeavetype(String leavetype) {
        String oldLeavetype = this.leavetype;
        this.leavetype = leavetype;
        changeSupport.firePropertyChange("leavetype", oldLeavetype, leavetype);
    }

    public String getLeavereason() {
        return leavereason;
    }

    public void setLeavereason(String leavereason) {
        String oldLeavereason = this.leavereason;
        this.leavereason = leavereason;
        changeSupport.firePropertyChange("leavereason", oldLeavereason, leavereason);
    }

    public String getLeavestatus() {
        return leavestatus;
    }

    public void setLeavestatus(String leavestatus) {
        String oldLeavestatus = this.leavestatus;
        this.leavestatus = leavestatus;
        changeSupport.firePropertyChange("leavestatus", oldLeavestatus, leavestatus);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (srNo != null ? srNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Leaveapply)) {
            return false;
        }
        Leaveapply other = (Leaveapply) object;
        if ((this.srNo == null && other.srNo != null) || (this.srNo != null && !this.srNo.equals(other.srNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "leavemanagementsystempbl.Leaveapply[ srNo=" + srNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
