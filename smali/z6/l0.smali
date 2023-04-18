.class public final synthetic Lz6/l0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz6/m0$b;


# instance fields
.field public final synthetic a:Lz6/m0;

.field public final synthetic b:Lq6/i;

.field public final synthetic c:Lq6/o;


# direct methods
.method public synthetic constructor <init>(Lz6/m0;Lq6/i;Lq6/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz6/l0;->a:Lz6/m0;

    iput-object p2, p0, Lz6/l0;->b:Lq6/i;

    iput-object p3, p0, Lz6/l0;->c:Lq6/o;

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lz6/l0;->a:Lz6/m0;

    iget-object v1, p0, Lz6/l0;->b:Lq6/i;

    iget-object v2, p0, Lz6/l0;->c:Lq6/o;

    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    invoke-static {v0, v1, v2, p1}, Lz6/m0;->B0(Lz6/m0;Lq6/i;Lq6/o;Landroid/database/sqlite/SQLiteDatabase;)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method
