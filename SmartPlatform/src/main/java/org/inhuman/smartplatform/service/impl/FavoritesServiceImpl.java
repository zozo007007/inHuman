package org.inhuman.smartplatform.service.impl;

import org.inhuman.smartplatform.mapper.FavoritesMapper;
import org.inhuman.smartplatform.pojo.Postings;
import org.inhuman.smartplatform.service.FavoritesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FavoritesServiceImpl implements FavoritesService {

    @Autowired
    FavoritesMapper favoritesMapper;


    @Override
    public List<Postings> getFavorites(int id) {
        return favoritesMapper.getFavorites(id);
    }

    @Override
    public void addFavorites(int id, int postingId, String type) {
        if (type == null || type.isEmpty()) {
            type = "默认收藏夹";
        }
        favoritesMapper.addFavorites(id,postingId,type);
    }

    @Override
    public void deleteFavorites(int id, int postingId) {
        favoritesMapper.deleteFavorites(id,postingId);
    }

    @Override
    public void updateFavoritesType(int id, int postingId, String type) {
        favoritesMapper.updateFavoritesType(id,postingId,type);
    }
}
