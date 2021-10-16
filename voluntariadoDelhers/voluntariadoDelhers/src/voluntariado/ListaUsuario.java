package voluntariado;

public class ListaUsuario{
	Usuario primero;
        
        public void agregarUsuario(Usuario nuevo){
		if(this.primero == null){
			this.primero = nuevo;
                        System.out.println("Se creó el usuario con nombre" + this.primero.nombre);
		} else {
			Usuario temporal = this.primero;

			while(temporal.siguiente != null){
				temporal = temporal.siguiente;
			}

			temporal.siguiente = nuevo;
		}
	}
        
        public boolean Buscar(String n){
		boolean encontrado = false;
		String nombre;
		Usuario temporal = this.primero;

		while(temporal != null){
			if(temporal.nombre.equals(n)){
				encontrado = true;
				break;
			} else {
				temporal = temporal.siguiente;
			}
		}
		return encontrado;
	}
        
    public boolean verificarContrasenia(String n, String c){
		boolean encontrado = false;		
		Usuario temporal = this.primero;

		while(temporal != null){
			if(temporal.nombre.equals(n) && temporal.contrasenia.equals(c)){
				encontrado = true;
				break;
			} else {
				temporal = temporal.siguiente;
			}
		}

		return encontrado;
	}
}