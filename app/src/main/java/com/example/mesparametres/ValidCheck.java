package com.example.mesparametres;

public class ValidCheck {
    int id;
    String nomParam;
    String valid;


    public ValidCheck(int id, String nomParam, String valid) {
        this.id = id;
        this.nomParam = nomParam;
        this.valid = valid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomParam() {
        return nomParam;
    }

    public void setNomParam(String nomParam) {
        this.nomParam = nomParam;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }
}
