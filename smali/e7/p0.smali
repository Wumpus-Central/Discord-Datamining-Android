.class public final synthetic Le7/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/q$a;


# instance fields
.field public final synthetic a:Le7/e1$a;

.field public final synthetic b:Lcom/google/android/exoplayer2/source/TrackGroupArray;

.field public final synthetic c:Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;


# direct methods
.method public synthetic constructor <init>(Le7/e1$a;Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/p0;->a:Le7/e1$a;

    iput-object p2, p0, Le7/p0;->b:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iput-object p3, p0, Le7/p0;->c:Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Le7/p0;->a:Le7/e1$a;

    iget-object v1, p0, Le7/p0;->b:Lcom/google/android/exoplayer2/source/TrackGroupArray;

    iget-object v2, p0, Le7/p0;->c:Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;

    check-cast p1, Le7/e1;

    invoke-static {v0, v1, v2, p1}, Le7/d1;->L(Le7/e1$a;Lcom/google/android/exoplayer2/source/TrackGroupArray;Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;Le7/e1;)V

    return-void
.end method
