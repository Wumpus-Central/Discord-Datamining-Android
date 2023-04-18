.class Ld2/a$p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld2/a;->g(Landroid/net/Uri;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Landroid/net/Uri;

.field final synthetic l:J

.field final synthetic m:Ld2/a;


# direct methods
.method constructor <init>(Ld2/a;Landroid/net/Uri;J)V
    .locals 0

    iput-object p1, p0, Ld2/a$p0;->m:Ld2/a;

    iput-object p2, p0, Ld2/a$p0;->k:Landroid/net/Uri;

    iput-wide p3, p0, Ld2/a$p0;->l:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Ld2/a$p0;->m:Ld2/a;

    iget-object v1, p0, Ld2/a$p0;->k:Landroid/net/Uri;

    iget-wide v2, p0, Ld2/a$p0;->l:J

    invoke-static {v0, v1, v2, v3}, Ld2/a;->O(Ld2/a;Landroid/net/Uri;J)V

    return-void
.end method
