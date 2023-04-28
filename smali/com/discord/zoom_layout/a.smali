.class public final synthetic Lcom/discord/zoom_layout/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Lcom/discord/zoom_layout/ZoomLayoutFixed;


# direct methods
.method public synthetic constructor <init>(Lcom/discord/zoom_layout/ZoomLayoutFixed;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/discord/zoom_layout/a;->k:Lcom/discord/zoom_layout/ZoomLayoutFixed;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/discord/zoom_layout/a;->k:Lcom/discord/zoom_layout/ZoomLayoutFixed;

    invoke-static {v0}, Lcom/discord/zoom_layout/ZoomLayoutFixed;->b(Lcom/discord/zoom_layout/ZoomLayoutFixed;)V

    return-void
.end method
