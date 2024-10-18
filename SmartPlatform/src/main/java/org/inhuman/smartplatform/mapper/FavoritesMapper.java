package org.inhuman.smartplatform.mapper;

import org.apache.ibatis.annotations.*;
import org.inhuman.smartplatform.pojo.Postings;

import java.util.List;

@Mapper
public interface FavoritesMapper {

    @Select("select postings.*,favorites.type from postings join favorites on postings.id = favorites.postingsId where favorites.userId = #{id} order by favorites.type")
    List<Postings> getFavorites(int id);

    @Insert("insert favorites value (#{id},#{postingId},#{type})")
    void addFavorites(int id, int postingId,String type);


    @Delete("delete from favorites where favorites.userId = #{id} and favorites.postingsId = #{postingId}")
    void deleteFavorites(int id, int postingId);

    @Update("update favorites set favorites.type = #{type} where favorites.userId = #{id} and favorites.postingsId = #{postingId}")
    void updateFavoritesType(int id, int postingId, String type);
}
