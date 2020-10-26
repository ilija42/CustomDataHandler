package service;

import model.Entity;

import java.util.List;
import java.util.Map;

public interface IStorage {

    // Ideja je da ovde budu metode za CRUD operacije i filtriranje
    // Koje ce da barataju Database-om (u njemu je lista svih entiteta i samo najosnovnije metode)

    // Nalupala sam metode za pocetak, izmeni/dodaj sta god ali da bude univerzalno korisceno u aplikaciji
    public void add (String path, Entity entity) throws Exception;  // TODO generisanje vs zadavanje ID-ja?
    public void add (String path, String id, String name, Map<String, String> map) throws Exception;

    public <T> T findById(String path, String id, String type);
    public <T> T findById(String path, String id);
    public <T> List<T> findByType(String path, String type);

    // nisam sigurna da li cemo pretrazivati fajlove ili ucitati u aplikaciju sve pa pretrazivati objekte
    public <T> T findByIdLocal(String id, String type);
    public <T> T findByIdLocal(String id);
    public <T> List<T> findByTypeLocal(String type);

}
