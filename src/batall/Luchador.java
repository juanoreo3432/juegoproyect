/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batall;

/**
 *
 * @author APRENDIZ
 */
class Luchador {
    private String nombre;
    private int hp;
    private int atk;
    private int def;
    private int des;

    public Luchador() {
   
    }

    public Luchador(String nombre, int hp, int atk, int def, int des) {
        this.nombre = nombre;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.des = des;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getDes() {
        return des;
    }

    public void setDes(int des) {
        this.des = des;
    }
   
    public void mostrar(){
        System.out.println("NOMBRE:"+this.nombre);
        System.out.println("HP: "+this.hp);
        System.out.println("ATK: "+this.atk);
        System.out.println("DEF: "+this.def);
        System.out.println("DES: "+this.des);
    }
   
    public void atacarLuchador(Luchador luchador){//el parametro es el luchador que llega
       
        System.out.println("Tiro de dados para destreza......");
        int dl1 = (int) (Math.random() * (20 - 1+1)) + 1;  
        int dl2 = (int) (Math.random() * (20 - 1+1)) + 1;
         
        System.out.println("dado 1:"+dl1);
        System.out.println("dado 2:"+dl2);
        System.out.println(" ");
       
        //modificamos la destreza con el dado 20
        this.setDes(this.des+dl1);
        luchador.setDes(luchador.des+dl2);
        //modificamos el atk con el dado 20
        this.setAtk(this.atk+dl1);
        luchador.setAtk(luchador.atk+dl2);
        //atributos en pantalla
        System.out.println("Nombre: "+this.nombre+" "+"Atk: "+this.atk+" "+"Des: "+this.des);
        System.out.println("Nombre: "+luchador.nombre+" "+"Atk: "+luchador.atk+" "+"Des: "+luchador.des);
        System.out.println(" ");
       
        if(this.des>luchador.des){
            luchador.hp=luchador.hp-(luchador.atk-this.def);
            luchador.mostrar();
                     
        }
        else if(this.des<luchador.des){
           this.hp=this.hp-(this.atk-luchador.def);
           this.mostrar();
           
        }
        this.des=60;
        luchador.des=60;
        this.atk=100;
        luchador.atk=100;
   
    }
}
