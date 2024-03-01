package com.example.Telegrambot.config;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
@Configuration
@Data

@PropertySource(value = "config.properties")
public class BotConfig {
    private final String botName= "GyverKit";
    private final String token= "7123128662:AAFk9Y_lHIuiGvIRNR2R_FFrqVUG9TzU4S0";
    private final String chatId= "1742873861";
}