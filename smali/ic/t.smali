.class public final synthetic Lic/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic k:Ljava/util/Map$Entry;

.field public final synthetic l:Lpc/a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/Map$Entry;Lpc/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lic/t;->k:Ljava/util/Map$Entry;

    iput-object p2, p0, Lic/t;->l:Lpc/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lic/t;->k:Ljava/util/Map$Entry;

    iget-object v1, p0, Lic/t;->l:Lpc/a;

    invoke-static {v0, v1}, Lic/u;->b(Ljava/util/Map$Entry;Lpc/a;)V

    return-void
.end method
