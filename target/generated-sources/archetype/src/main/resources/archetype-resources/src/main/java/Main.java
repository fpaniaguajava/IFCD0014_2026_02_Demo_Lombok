#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Pelicula elResplandor = new Pelicula("El Resplandor", "Kubrick", "Terror", 1978);
        Pelicula alien = new Pelicula();
        alien.setTitulo("Alien, el octavo pasajero");
        alien.setDirector("Ridley Scott");
        alien.setGenero("Terror");
        alien.setAnyo(1979);
        System.out.println(elResplandor.getTitulo());
        System.out.println(alien);
    }
}
