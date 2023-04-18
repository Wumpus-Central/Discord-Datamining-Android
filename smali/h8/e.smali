.class public final synthetic Lh8/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh8/u$b;


# instance fields
.field public final synthetic a:Lh8/f;

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lh8/f;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh8/e;->a:Lh8/f;

    iput-object p2, p0, Lh8/e;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a(Lh8/u;Lcom/google/android/exoplayer2/Timeline;)V
    .locals 2

    iget-object v0, p0, Lh8/e;->a:Lh8/f;

    iget-object v1, p0, Lh8/e;->b:Ljava/lang/Object;

    invoke-static {v0, v1, p1, p2}, Lh8/f;->D(Lh8/f;Ljava/lang/Object;Lh8/u;Lcom/google/android/exoplayer2/Timeline;)V

    return-void
.end method
