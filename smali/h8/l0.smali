.class public final synthetic Lh8/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj7/y;


# instance fields
.field public final synthetic a:Lj7/x;


# direct methods
.method public synthetic constructor <init>(Lj7/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh8/l0;->a:Lj7/x;

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/exoplayer2/MediaItem;)Lj7/x;
    .locals 1

    iget-object v0, p0, Lh8/l0;->a:Lj7/x;

    invoke-static {v0, p1}, Lh8/k0$b;->a(Lj7/x;Lcom/google/android/exoplayer2/MediaItem;)Lj7/x;

    move-result-object p1

    return-object p1
.end method
