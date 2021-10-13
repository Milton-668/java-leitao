package especial;

public class User {

    String name;
    String email;

    public boolean equals(Object objeto) {
        //Nesse caso estamos validando se o objeto é uma instacia de usuario, ou seja,
        //se os componentes de objeto batem com o usuario.
        if (objeto instanceof User) {
            //Nesse caso está sendo feito um cast de objeto para User, ou seja ma conversão de objeto para User.
            User other = (User) objeto;

            boolean nomeIgual = other.name.equals(this.name);
            boolean emailIgual = other.email.equals(this.email);
            return nomeIgual && emailIgual;
        } else {
            return false;
        }
    }

}
