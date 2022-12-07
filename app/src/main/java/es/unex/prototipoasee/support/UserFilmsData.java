package es.unex.prototipoasee.support;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import es.unex.prototipoasee.model.Films;

/**
 * Clase para mantener durante la ejecución de la aplicación una única instancia de la información viva del usuario
 */
public class UserFilmsData {
    public HashMap<Integer, Films> userPendingFilms = new HashMap<>();
    public HashMap<Integer, Films> userFavoriteFilms = new HashMap<>();
    public Set<Integer> userRatedFilms = new HashSet<>();
    private static UserFilmsData instance = null;

    public static UserFilmsData getInstance() {
        if (instance==null) {
            instance = new UserFilmsData();
        }
        return instance;
    }
}
