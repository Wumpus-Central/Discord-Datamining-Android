.class public final synthetic Le7/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf9/q$b;


# instance fields
.field public final synthetic a:Le7/d1;

.field public final synthetic b:Lcom/google/android/exoplayer2/Player;


# direct methods
.method public synthetic constructor <init>(Le7/d1;Lcom/google/android/exoplayer2/Player;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le7/a1;->a:Le7/d1;

    iput-object p2, p0, Le7/a1;->b:Lcom/google/android/exoplayer2/Player;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Lf9/v;)V
    .locals 2

    iget-object v0, p0, Le7/a1;->a:Le7/d1;

    iget-object v1, p0, Le7/a1;->b:Lcom/google/android/exoplayer2/Player;

    check-cast p1, Le7/e1;

    check-cast p2, Le7/e1$b;

    invoke-static {v0, v1, p1, p2}, Le7/d1;->G0(Le7/d1;Lcom/google/android/exoplayer2/Player;Le7/e1;Le7/e1$b;)V

    return-void
.end method
