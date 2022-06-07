package Mundo;

import gfutria.Logic;

public class Misioneros extends Logic {

    // Atributos
    private int misionerosder = 3;
    private int canibalesder = 3;
    private int misionerosizq = 0;
    private int canibalesizq = 0;
    private int barca = 1; // 1 = izq - 0 = der

    //Constructor Vacio
    public Misioneros() {
    }

    //Constructor
    public Misioneros(int misionerosizq, int canibalesizq, int misionerosder, int canibalesder, int barca) {
        this.misionerosizq = misionerosizq;
        this.canibalesizq = canibalesizq;
        this.misionerosder = misionerosder;
        this.canibalesder = canibalesder;
        this.barca = barca;
    }

    //Setters and Getters
    public int getMisionerosder() {
        return misionerosder;
    }

    public void setMisionerosder(int misionerosder) {
        this.misionerosder = misionerosder;
    }

    public int getCanibalesder() {
        return canibalesder;
    }

    public void setCanibalesder(int canibalesder) {
        this.canibalesder = canibalesder;
    }

    public int getMisionerosizq() {
        return misionerosizq;
    }

    public void setMisionerosizq(int misionerosizq) {
        this.misionerosizq = misionerosizq;
    }

    public int getCanibalesizq() {
        return canibalesizq;
    }

    public void setCanibalesizq(int canibalesizq) {
        this.canibalesizq = canibalesizq;
    }

    public int getBarca() {
        return barca;
    }

    public void setBarca(int barca) {
        this.barca = barca;
    }

  // Metodos
  /* public void getEstado() {
        return +misionerosizq + " " + canibalesizq + " | " + barca + " | " + misionerosder + " " + canibalesder;
    } */

    //A--No Lleva Ningun Misioneros y un Canibal
    public void c() {
        //Decimos desde que orilla partimos
        if (barca == 0) //Barca empieza en la derecha
        {
            if (canibalesder >= 1) {
                if (((canibalesizq + 1) > misionerosizq) && (misionerosizq == 0)) {
                    //System.out.println("Si se puede");
                    barca = 1;
                    canibalesizq = canibalesizq + 1;
                    canibalesder = canibalesder - 1;

                } else if ((canibalesizq + 1) <= misionerosizq) {
                    // System.out.println("si se puede");
                    barca = 1;
                    canibalesizq = canibalesizq + 1;
                    canibalesder = canibalesder - 1;
                } else {
                    System.out.println("C1");
                }
            }
        } else if (barca == 1) //Barca empieza en la izquierda
        {
            if (canibalesizq >= 1) {
                if (((canibalesder + 1) > misionerosder) && (misionerosder == 0)) {
                    // System.out.println("Si se puede");
                    barca = 0;
                    canibalesder = canibalesder + 1;
                    canibalesizq = canibalesizq - 1;
                } else if ((canibalesder + 1) <= misionerosder) {
                    //System.out.println("si se puede");
                    barca = 0;
                    canibalesder = canibalesder + 1;
                    canibalesizq = canibalesizq - 1;
                } else {
                    System.out.println("C2");
                }
            }
        }
    }
    //B--Lleva 2 Misioneros y ningun Canibal

    public void mm() {
        misionerosder = getMisionerosder();
        canibalesder = getCanibalesder();
        misionerosizq = getMisionerosizq();
        canibalesizq = getCanibalesizq();
        barca = getBarca();

        //Decimos desde que orilla partimos
        if (barca == 0) //Barca empieza en la derecha
        {
            if (misionerosder >= 2) {
                if (((misionerosizq + 2) >= canibalesizq)) {
                    //System.out.println("Si se puede");
                    barca = 1;
                    misionerosizq = misionerosizq + 2;
                    misionerosder = misionerosder - 2;
                } else {
                    System.out.println("MM1");
                }
            }
        } else if (barca == 1) //Barca empieza en la izquierda
        {
            if (misionerosizq >= 2) {
                if (((misionerosder + 2) >= canibalesder)) {
                    //System.out.println("Si se puede");
                    barca = 0;
                    misionerosder = misionerosder + 2;
                    misionerosizq = misionerosizq - 2;
                } else {
                    System.out.println("MM2");
                }

            }
        }
    }

    //C--Lleva 2 Canibales y ningun Misionero
    public void cc() {
        //Decimos desde que orilla partimos
        if (barca == 0) //Barca empieza en la derecha
        {
            if (canibalesder >= 2) {
                if ((((canibalesizq + 2) <= misionerosizq) || (misionerosizq == 0))) {
                    //System.out.println("Si se puede");
                    barca = 1;
                    canibalesizq = canibalesizq + 2;
                    canibalesder = canibalesder - 2;
                } else {
                    System.out.println("CC1");
                }
            }
        } else if (barca == 1) //Barca empieza en la izquierda
        {
            if (canibalesizq >= 2) {
                if ((((canibalesder + 2) <= misionerosder) || (misionerosder == 0))) {
                    //System.out.println("Si se puede");
                    barca = 0;
                    canibalesizq = canibalesizq - 2;
                    canibalesder = canibalesder + 2;
                } else {
                    System.out.println("CC2");
                }
            }
        }
    }

    //D--llevar 1 misioneros
    public void m() {
        //Decimos desde que orilla partimos
        if (barca == 0) //Barca empieza en la derecha
        {
            if (misionerosder >= 1) {
                if ((((misionerosizq + 1) >= canibalesizq)) && (((misionerosder - 1) >= canibalesder) || ((misionerosder - 1) == 0))) {
                    //System.out.println("Si se puede");
                    barca = 1;
                    misionerosizq = misionerosizq + 1;
                    misionerosder = misionerosder - 1;
                }
            }
        } else if (barca == 1) //Barca empieza en la izquierda
        {
            if (misionerosizq >= 1) {
                if ((((misionerosder + 1) >= misionerosder)) && (((misionerosizq - 1) >= canibalesizq) || ((misionerosizq - 1) == 0))) {
                    //System.out.println("Si se puede");
                    barca = 0;
                    misionerosder = misionerosder + 1;
                    misionerosizq = misionerosizq - 1;
                }
            }
        }
    }

    //E--llevar 1 misioneros y 1 canibal
    public void cm() {
        //Decimos desde que orilla partimos
        if (barca == 0) //Barca empieza en la derecha
        {
            if ((misionerosder >= canibalesder) && (misionerosder > 0 && canibalesder > 0)) {
                if (((misionerosizq + 1) >= (canibalesizq + 1))) {
                    //System.out.println("Si se puede");
                    barca = 1;
                    misionerosizq = misionerosizq + 1;
                    misionerosder = misionerosder - 1;
                    canibalesizq = canibalesizq + 1;
                    canibalesder = canibalesder - 1;
                }
            }
        } else if (barca == 1) //Barca empieza en la izquierda
        {
            if ((misionerosizq >= canibalesizq) && (misionerosizq > 0 && canibalesizq > 0)) {
                if (((misionerosder + 1) >= (misionerosder + 1))) {
                    //System.out.println("Si se puede");
                    barca = 0;
                    misionerosder = misionerosder + 1;
                    misionerosizq = misionerosizq - 1;
                    canibalesder = canibalesder + 1;
                    canibalesizq = canibalesizq - 1;
                }
            }
        }
    }

// Metodos sobreescritos de la clases Logic   
    public void action(int index) {
        switch (index) {
            case 1:
                m();
                break;
            case 2:
                c();
                break;
            case 3:
                cc();
                break;
            case 4:
                mm();
                break;
            case 5:
                cm();
                break;
        }
    }

    public String state() {
        return + misionerosizq + "" + canibalesizq + "" + barca + "" + misionerosder + "" + canibalesder;
    }

    public Logic cloneObject(Logic object) {
      Misioneros obj = (Misioneros)object;
      Misioneros objClone;
      objClone = new Misioneros();
      objClone.setMisionerosder(obj.getMisionerosder());
      objClone.setCanibalesder(obj.getCanibalesder());
      objClone.setMisionerosizq(obj.getMisionerosizq());
      objClone.setCanibalesizq(obj.getCanibalesizq()); 
      objClone.setBarca(obj.getBarca());
      return objClone; 
    }

}
