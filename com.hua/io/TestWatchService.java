package com.hua.io;

import java.io.IOException;
import java.nio.file.*;

import static java.nio.file.StandardWatchEventKinds.*;

public class TestWatchService {

    public static void main(String[] args) throws IOException, InterruptedException {
        WatchService watchService = FileSystems.getDefault().newWatchService();
        Path path = Paths.get("/Users/hualiang/code/java-playground");
        path.register(watchService, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
        while (true) {
            WatchKey key = watchService.take();
            for (WatchEvent<?> event : key.pollEvents()) {
                WatchEvent.Kind<?> kind = event.kind();
                System.out.println("event name: " + kind.name() + ", filename: " + event.context());
            }
        }

    }
}
