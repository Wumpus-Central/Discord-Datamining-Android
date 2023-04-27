.class public final synthetic Lcom/google/android/exoplayer2/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg9/q$b;


# instance fields
.field public final synthetic a:Lcom/google/android/exoplayer2/Player;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/exoplayer2/Player;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/s;->a:Lcom/google/android/exoplayer2/Player;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lg9/v;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/exoplayer2/s;->a:Lcom/google/android/exoplayer2/Player;

    check-cast p1, Lcom/google/android/exoplayer2/Player$a;

    check-cast p2, Lcom/google/android/exoplayer2/Player$Events;

    invoke-static {v0, p1, p2}, Lcom/google/android/exoplayer2/d0;->m0(Lcom/google/android/exoplayer2/Player;Lcom/google/android/exoplayer2/Player$a;Lcom/google/android/exoplayer2/Player$Events;)V

    return-void
.end method
