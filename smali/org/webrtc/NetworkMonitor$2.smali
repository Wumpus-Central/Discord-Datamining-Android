.class Lorg/webrtc/NetworkMonitor$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lorg/webrtc/NetworkChangeDetector$Observer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/webrtc/NetworkMonitor;->createNetworkChangeDetector(Landroid/content/Context;)Lorg/webrtc/NetworkChangeDetector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/webrtc/NetworkMonitor;


# direct methods
.method constructor <init>(Lorg/webrtc/NetworkMonitor;)V
    .locals 0

    iput-object p1, p0, Lorg/webrtc/NetworkMonitor$2;->this$0:Lorg/webrtc/NetworkMonitor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onConnectionTypeChanged(Lorg/webrtc/NetworkChangeDetector$ConnectionType;)V
    .locals 1

    iget-object v0, p0, Lorg/webrtc/NetworkMonitor$2;->this$0:Lorg/webrtc/NetworkMonitor;

    invoke-static {v0, p1}, Lorg/webrtc/NetworkMonitor;->access$100(Lorg/webrtc/NetworkMonitor;Lorg/webrtc/NetworkChangeDetector$ConnectionType;)V

    return-void
.end method

.method public onNetworkConnect(Lorg/webrtc/NetworkChangeDetector$NetworkInformation;)V
    .locals 1

    iget-object v0, p0, Lorg/webrtc/NetworkMonitor$2;->this$0:Lorg/webrtc/NetworkMonitor;

    invoke-static {v0, p1}, Lorg/webrtc/NetworkMonitor;->access$200(Lorg/webrtc/NetworkMonitor;Lorg/webrtc/NetworkChangeDetector$NetworkInformation;)V

    return-void
.end method

.method public onNetworkDisconnect(J)V
    .locals 1

    iget-object v0, p0, Lorg/webrtc/NetworkMonitor$2;->this$0:Lorg/webrtc/NetworkMonitor;

    invoke-static {v0, p1, p2}, Lorg/webrtc/NetworkMonitor;->access$300(Lorg/webrtc/NetworkMonitor;J)V

    return-void
.end method

.method public onNetworkPreference(Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/webrtc/NetworkChangeDetector$ConnectionType;",
            ">;I)V"
        }
    .end annotation

    iget-object v0, p0, Lorg/webrtc/NetworkMonitor$2;->this$0:Lorg/webrtc/NetworkMonitor;

    invoke-static {v0, p1, p2}, Lorg/webrtc/NetworkMonitor;->access$400(Lorg/webrtc/NetworkMonitor;Ljava/util/List;I)V

    return-void
.end method
