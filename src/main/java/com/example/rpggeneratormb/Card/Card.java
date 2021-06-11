package com.example.rpggeneratormb.Card;

import javax.persistence.*;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", characterName='" + characterName + '\'' +
                ", race='" + race + '\'' +
                ", WW=" + WW +
                ", US=" + US +
                ", KR=" + KR +
                ", ODP=" + ODP +
                ", ZR=" + ZR +
                ", SW=" + SW +
                ", OGD=" + OGD +
                ", ATAK=" + ATAK +
                ", ZYW=" + ZYW +
                ", SIL=" + SIL +
                ", WYT=" + WYT +
                ", SZ=" + SZ +
                ", MAG=" + MAG +
                ", PO=" + PO +
                ", PP=" + PP +
                '}';
    }

    private String characterName;
    private String race;
    private int WW;
    private int US;
    private int KR;
    private int ODP;
    private int ZR;
    private int SW;
    private int OGD;
    private int ATAK;
    private int ZYW;
    private int SIL;
    private int WYT;
    private int SZ;
    private int MAG;
    private int PO;
    private int PP;


    public Card(String characterName, String race, int WW, int US, int KR, int ODP, int ZR, int SW, int OGD, int ATAK, int ZYW, int SIL, int WYT, int SZ, int MAG, int PO, int PP/*, String attributes*/) {
        this.characterName = characterName;
        this.race = race;
        this.WW = WW;
        this.US = US;
        this.KR = KR;
        this.ODP = ODP;
        this.ZR = ZR;
        this.SW = SW;
        this.OGD = OGD;
        this.ATAK = ATAK;
        this.ZYW = ZYW;
        this.SIL = SIL;
        this.WYT = WYT;
        this.SZ = SZ;
        this.MAG = MAG;
        this.PO = PO;
        this.PP = PP;
    }

    public Card() {
        super();
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getWW() {
        return WW;
    }

    public void setWW(int WW) {
        this.WW = WW;
    }

    public int getUS() {
        return US;
    }

    public void setUS(int US) {
        this.US = US;
    }

    public int getKR() {
        return KR;
    }

    public void setKR(int KR) {
        this.KR = KR;
    }

    public int getODP() {
        return ODP;
    }

    public void setODP(int ODP) {
        this.ODP = ODP;
    }

    public int getZR() {
        return ZR;
    }

    public void setZR(int ZR) {
        this.ZR = ZR;
    }

    public int getSW() {
        return SW;
    }

    public void setSW(int SW) {
        this.SW = SW;
    }

    public int getOGD() {
        return OGD;
    }

    public void setOGD(int OGD) {
        this.OGD = OGD;
    }

    public int getATAK() {
        return ATAK;
    }

    public void setATAK(int ATAK) {
        this.ATAK = ATAK;
    }

    public int getZYW() {
        return ZYW;
    }

    public void setZYW(int ZYW) {
        this.ZYW = ZYW;
    }

    public int getSIL() {
        return SIL;
    }

    public void setSIL(int SIL) {
        this.SIL = SIL;
    }

    public int getWYT() {
        return WYT;
    }

    public void setWYT(int WYT) {
        this.WYT = WYT;
    }

    public int getSZ() {
        return SZ;
    }

    public void setSZ(int SZ) {
        this.SZ = SZ;
    }

    public int getMAG() {
        return MAG;
    }

    public void setMAG(int MAG) {
        this.MAG = MAG;
    }

    public int getPO() {
        return PO;
    }

    public void setPO(int PO) {
        this.PO = PO;
    }

    public int getPP() {
        return PP;
    }

    public void setPP(int PP) {
        this.PP = PP;
    }

}