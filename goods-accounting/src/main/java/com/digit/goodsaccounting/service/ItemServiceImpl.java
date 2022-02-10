package com.digit.goodsaccounting.service;

import com.digit.goodsaccounting.model.Item;
import com.digit.goodsaccounting.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> getAllItem() {
        return itemRepository.findAll();
    }

    @Override
    public void save(MultipartFile file) {
        Path tempPath = Paths.get("temp");
        String path;
        try (OutputStream os = Files.newOutputStream(tempPath)) {
            os.write(file.getBytes());
            path = tempPath.toAbsolutePath().toString();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }

        Item item;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            item = (Item) objectInputStream.readObject();
            objectInputStream.close();
            System.out.println(item);
            itemRepository.save(item);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
