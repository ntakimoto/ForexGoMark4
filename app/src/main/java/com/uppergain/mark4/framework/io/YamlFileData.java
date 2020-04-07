package com.uppergain.mark4.framework.io;

import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * Yamlファイルを操作する基底クラス<br>
 * 基底GoF:Strategy
 *
 * @author ntakimoto
 * @version 0.0.2
 * @since 2020-04-05
 */
public class YamlFileData implements DataFileIO {

    //TODO キャッシュディレクトリを指定する
    private String path = "";

    public YamlFileData() {}

    public YamlFileData(String fileName) {
    }

    @Override
    public Object reder(String target) {
        String encoding = "UTF-8";

        File file = new File(path + target + ".yaml");
        FileInputStream input;
        InputStreamReader stream = null;
        try {
            input = new FileInputStream(file);
            stream = new InputStreamReader(input, encoding);
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            System.out.println(e.getClass().getName() + " fail open file " + path);
        }
        Yaml yaml = new Yaml();
        Object loadFile = yaml.load(stream);
        return loadFile;
    }

    @Override
    public void writer(String target, Object data) {
        Yaml yaml = new Yaml();
        FileWriter writer;
        try {
            writer = new FileWriter(path + target + ".yaml");
            yaml.dump(data, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public Object update(String key, Object newData) {
        File file = new File(path + key + ".yaml");
        // フォルダの存在を確認する
        if (file.exists()) {
            file.delete();
            this.writer(key, newData);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void delete(String targetData) {
        File file = new File(path + targetData + ".yaml");
        file.delete();
    }

    @Override
    public int counter() {
        return 0;
    }

    /**
     * 指定ていあるフォルダパスを返す
     * @return
     */
    public String getFilePath() {
        return this.path;
    }

    /**
     * フォルダパスを指定する
     * @param filePath
     */
    public void setFilePath(String filePath) {
        this.path = filePath;
    }
}
