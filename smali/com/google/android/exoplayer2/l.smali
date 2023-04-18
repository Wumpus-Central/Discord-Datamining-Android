.class public final synthetic Lcom/google/android/exoplayer2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/q$a;


# instance fields
.field public final synthetic a:Lcom/google/android/exoplayer2/q0;

.field public final synthetic b:Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/exoplayer2/l;->a:Lcom/google/android/exoplayer2/q0;

    iput-object p2, p0, Lcom/google/android/exoplayer2/l;->b:Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/exoplayer2/l;->a:Lcom/google/android/exoplayer2/q0;

    iget-object v1, p0, Lcom/google/android/exoplayer2/l;->b:Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;

    check-cast p1, Lcom/google/android/exoplayer2/Player$a;

    invoke-static {v0, v1, p1}, Lcom/google/android/exoplayer2/d0;->n0(Lcom/google/android/exoplayer2/q0;Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;Lcom/google/android/exoplayer2/Player$a;)V

    return-void
.end method
