package com.astatin3.meteorbot.modules;

import com.astatin3.meteorbot.Addon;
import com.github.steveice10.mc.auth.data.GameProfile;
import com.github.steveice10.mc.auth.service.SessionService;
import com.github.steveice10.mc.protocol.MinecraftConstants;
import com.github.steveice10.mc.protocol.codec.MinecraftCodec;
import com.github.steveice10.mc.protocol.packet.ingame.clientbound.ClientboundLoginPacket;
import com.github.steveice10.mc.protocol.packet.ingame.clientbound.ClientboundSystemChatPacket;
import com.github.steveice10.mc.protocol.packet.ingame.serverbound.ServerboundChatPacket;
import com.github.steveice10.packetlib.ProxyInfo;
import com.github.steveice10.packetlib.event.session.DisconnectedEvent;
import com.github.steveice10.packetlib.packet.Packet;
import meteordevelopment.meteorclient.systems.modules.Module;

import java.io.IOException;
import java.net.Proxy;
import com.github.steveice10.mc.protocol.MinecraftProtocol;
import com.github.steveice10.mc.protocol.packet.common.clientbound.ClientboundS;
import com.github.steveice10.mc.protocol.packet.ingame.serverbound.Serverboundd;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.protocol.PacketDirection;
import net.minecraft.network.protocol.Protocol;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ModuleExample extends Module {
    public ModuleExample() {
        super(Addon.CATEGORY, "Meteor-Bot", "An example module in a custom category.");
    }

    private static final String USERNAME = "Username";
    private static final ProxyInfo PROXY = null;
    private static final Proxy AUTH_PROXY = Proxy.NO_PROXY;
    private static final String PASSWORD = "Password";
    private static final String HOST = "127.0.0.1";
    private static final int PORT = 25565;

    public void onActivate() {

    }
}

