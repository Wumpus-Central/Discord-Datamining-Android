package com.discord.client_info;

import android.content.Context;
import com.facebook.react.modules.network.OkHttpClientFactory;
import com.facebook.react.modules.network.OkHttpClientProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.q;
import okhttp3.Dispatcher;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\f"}, d2 = {"Lcom/discord/client_info/ClientUserAgent;", "", "()V", "createDispatcher", "Lokhttp3/Dispatcher;", "init", "", "context", "Landroid/content/Context;", "userAgent", "", "DiscordUserAgentInterceptor", "client_info_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ClientUserAgent {
    public static final ClientUserAgent INSTANCE = new ClientUserAgent();

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/discord/client_info/ClientUserAgent$DiscordUserAgentInterceptor;", "Lokhttp3/Interceptor;", "userAgent", "", "(Ljava/lang/String;)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "client_info_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class DiscordUserAgentInterceptor implements Interceptor {
        private final String userAgent;

        public DiscordUserAgentInterceptor(String userAgent) {
            q.g(userAgent, "userAgent");
            this.userAgent = userAgent;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) {
            q.g(chain, "chain");
            return chain.a(chain.b().i().i("User-Agent").a("User-Agent", this.userAgent).b());
        }
    }

    private ClientUserAgent() {
    }

    private final Dispatcher createDispatcher() {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.n(dispatcher.i() * 2);
        dispatcher.o(dispatcher.i());
        return dispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OkHttpClient init$lambda$0(Context context, String userAgent) {
        q.g(context, "$context");
        q.g(userAgent, "$userAgent");
        return OkHttpClientProvider.createClientBuilder(context).g(INSTANCE.createDispatcher()).a(new DiscordUserAgentInterceptor(userAgent)).c();
    }

    public final void init(final Context context, final String userAgent) {
        q.g(context, "context");
        q.g(userAgent, "userAgent");
        OkHttpClientProvider.setOkHttpClientFactory(new OkHttpClientFactory() { // from class: com.discord.client_info.a
            @Override // com.facebook.react.modules.network.OkHttpClientFactory
            public final OkHttpClient createNewNetworkModuleClient() {
                OkHttpClient init$lambda$0;
                init$lambda$0 = ClientUserAgent.init$lambda$0(context, userAgent);
                return init$lambda$0;
            }
        });
    }
}
