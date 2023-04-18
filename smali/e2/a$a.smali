.class Le2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le2/a;->b(Ld2/c;Ljava/util/Map;Le2/b$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic k:Le2/b$a;

.field final synthetic l:Ld2/c;

.field final synthetic m:Ljava/util/Map;

.field final synthetic n:Le2/a;


# direct methods
.method constructor <init>(Le2/a;Le2/b$a;Ld2/c;Ljava/util/Map;)V
    .locals 0

    iput-object p1, p0, Le2/a$a;->n:Le2/a;

    iput-object p2, p0, Le2/a$a;->k:Le2/b$a;

    iput-object p3, p0, Le2/a$a;->l:Ld2/c;

    iput-object p4, p0, Le2/a$a;->m:Ljava/util/Map;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Le2/a$a;->k:Le2/b$a;

    .line 2
    .line 3
    iget-object v1, p0, Le2/a$a;->n:Le2/a;

    .line 4
    .line 5
    iget-object v2, p0, Le2/a$a;->l:Ld2/c;

    .line 6
    .line 7
    iget-object v3, p0, Le2/a$a;->m:Ljava/util/Map;

    .line 8
    .line 9
    invoke-virtual {v1, v2, v3}, Le2/a;->a(Ld2/c;Ljava/util/Map;)Ld2/z0;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, v1}, Le2/b$a;->h(Ld2/z0;)V

    .line 14
    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
.end method
