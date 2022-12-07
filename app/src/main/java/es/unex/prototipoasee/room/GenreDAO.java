package es.unex.prototipoasee.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import es.unex.prototipoasee.model.Genre;

@Dao
public interface GenreDAO {

    @Insert
    void insertAllGenres(List<Genre> list);

    @Query("SELECT * FROM Genres")
    List<Genre> getAllGenres();
}
